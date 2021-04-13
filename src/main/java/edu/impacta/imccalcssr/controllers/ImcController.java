package edu.impacta.imccalcssr.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.impacta.imccalcssr.models.ImcLayer;
import edu.impacta.imccalcssr.models.Person;

@Controller
public class ImcController {

    private List<ImcLayer> imcLayers;

    public ImcController() {
        super();
        this.imcLayers = new ArrayList<>();
        this.imcLayers.add(new ImcLayer(0.00, 18.49, "Magreza"));
        this.imcLayers.add(new ImcLayer(18.50, 24.99, "Normal"));
        this.imcLayers.add(new ImcLayer(25.00, 29.99, "Sobrepeso"));
        this.imcLayers.add(new ImcLayer(30.00, 99.99, "Obesidade"));
    }

    @RequestMapping(value="/")
    public String index(Model model) {
        model.addAttribute("imcLayers", this.imcLayers);
        model.addAttribute("person", new Person());

        return "index";
    }
}
