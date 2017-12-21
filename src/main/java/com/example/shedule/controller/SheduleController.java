package com.example.shedule.controller;

        import com.example.shedule.domain.Shedule;
        import com.example.shedule.service.SheduleService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.http.HttpStatus;
        import org.springframework.http.ResponseEntity;
        import org.springframework.web.bind.annotation.PathVariable;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;
        import org.springframework.web.bind.annotation.RestController;

        import java.util.List;

@RestController
public class SheduleController {
    @Autowired
    SheduleService service;

    @RequestMapping(path = "/entity", method = RequestMethod.GET)
    public ResponseEntity<List<Shedule>> getEntity(){
        return new ResponseEntity(service.getShedule(), HttpStatus.OK);
    }

}

