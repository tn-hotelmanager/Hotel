package controller;

import entity.BookingDetailsEntity;
import entity.BookingsEntity;
import entity.CartEntity;
import entity.RoomsEntity;
import java.time.LocalDate;

import java.util.List;
import model.Search;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import repository.BookingDetailsRepository;
import repository.BookingsRepository;
import repository.RoomsRepository;


@Controller
@RequestMapping(value = "/")
@Scope("session")
public class CartController {
    @Autowired
    private CartEntity cart;
    @Autowired
    private RoomsRepository roomsRepository;
    @Autowired
    private BookingsRepository bookingsRepository;
    @Autowired
    private BookingDetailsRepository bookingDetailsRepository;
    @RequestMapping(value = "addCart/{roomId}")
    public String addItem(@PathVariable int roomId, Model model, Search search) {
        List<BookingDetailsEntity> bookingDetailsList  = cart.getBookingDetailsList();
        if(bookingDetailsList.size()<1){
            BookingDetailsEntity bookingDetails = new BookingDetailsEntity();
            RoomsEntity rooms = roomsRepository.findOne(roomId);
            bookingDetails.setRoom(rooms);
            bookingDetails.setBookingDetailsStart(search.getStart());
            bookingDetails.setBookingDetailsEnd(search.getEnd());
            bookingDetailsList.add(bookingDetails);
            cart.setBookingDetailsList(bookingDetailsList);   
        }else if(bookingDetailsList.size()>=1){
            boolean t = false;
            for (BookingDetailsEntity b : bookingDetailsList) {
                if(b.getRoom().getRoomId()==roomId){t=true;}
            }
            if(t==false){
                BookingDetailsEntity bookingDetails = new BookingDetailsEntity();
                RoomsEntity rooms = roomsRepository.findOne(roomId);
                bookingDetails.setRoom(rooms);
                bookingDetails.setBookingDetailsStart(search.getStart());
                bookingDetails.setBookingDetailsEnd(search.getEnd());
                bookingDetailsList.add(bookingDetails);
                cart.setBookingDetailsList(bookingDetailsList);
            }else {
                
            }
        }
        model.addAttribute("bookingDetailsList", bookingDetailsList);
        return "cart";
    }
    @RequestMapping(value = "removeCart/{roomId}")
    public String removeItem(@PathVariable int roomId,Model model, Search search) {
        List<BookingDetailsEntity> bookingDetailsList  = cart.getBookingDetailsList();
        BookingDetailsEntity removeBookingDetails = new BookingDetailsEntity();
        
        for(BookingDetailsEntity book : bookingDetailsList){
            if(book.getRoom().getRoomId() == roomId){
                removeBookingDetails = book;
            }
        }
        bookingDetailsList.remove(removeBookingDetails);
        cart.setBookingDetailsList(bookingDetailsList);
        model.addAttribute("search", search);
        return "cart";
    }
    @RequestMapping(value = "checkOut")
    public String checkOut(Model model){
        model.addAttribute("bookings", new BookingsEntity());
        model.addAttribute("bookingDetailsList", cart.getBookingDetailsList());
        
        return "booking";
    }
    @RequestMapping(value="saveOrder")
    public String saveOrder(Model model){
       
        return "results";
    }
}
