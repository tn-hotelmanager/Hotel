
package controller;

import entity.RoomsEntity;
import java.time.LocalDate;
import java.util.List;
import model.Search;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
import repository.UsersRepository;
import repository.CustomerRepository;
import repository.RoomsRepository;

@Controller
@RequestMapping(value = "/")
public class HotelManagerControler {
    @Autowired
    private RoomsRepository roomsRepository;
    @Autowired
    private UsersRepository usersRepository;
    @Autowired
    private CustomerRepository customerRepository;
    
    @RequestMapping(value = "listRooms", method = GET)
    public String listRooms(Model model, RoomsEntity rooms){
        List<RoomsEntity> roomsList = (List<RoomsEntity>) roomsRepository.findAll();
        model.addAttribute("roomsList", roomsList);
        return "roomsList";
    }            
    @RequestMapping(value = "search")
    public String listRoomSearch(Model model, String room, String numberBed, String searchStart, String searchEnd){
        String typeRoom="";
        int numberBedRoom =0;
        if(room.equals("normal")){
            typeRoom = "Room Normal";
        }else if(room.equals("super")){
            typeRoom = "Room Superior";
        }else if(room.equals("deluxe")){
            typeRoom = "Room Deluxe";
        }
        if(numberBed.equals("number1")){
            numberBedRoom =Integer.parseInt("1");
        }else if(numberBed.equals("number2")){
            numberBedRoom =Integer.parseInt("2");
        }
        
        LocalDate checkStart= LocalDate.parse(searchStart);
        LocalDate checkEnd= LocalDate.parse(searchEnd);
            Search search = new Search(room, numberBedRoom, checkStart, checkEnd);
        List<RoomsEntity> roomsList = 
                (List<RoomsEntity>) roomsRepository.searchRoomsBooking(typeRoom, numberBedRoom, checkStart, checkEnd);
        model.addAttribute("roomsList", roomsList);
        model.addAttribute("search", search);
        return "searchRoomsList";
    }

}
