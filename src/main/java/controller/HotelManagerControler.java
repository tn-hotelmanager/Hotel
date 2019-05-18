
package controller;

import entity.RoomsEntity;
import java.util.List;
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
        
        model.addAttribute(room, room);

        return "roomsList";
    }
}
