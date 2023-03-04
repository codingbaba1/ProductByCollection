package tv.oled.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tv.oled.entity.Led;

@RestController
public class ProductController {

	private List<Led> leds = new ArrayList<>();

	public ProductController() {
		leds.addAll(List.of(new Led("X75L", 45000.00), new Led("X80L", 51000.00), new Led("X85L", 45000.00), new Led("X90L", 71000.00), new Led("X95L", 86000.00), new Led("XAOLED", 145000.00)

		));
	}

	@RequestMapping(value = "/sony", method = RequestMethod.GET)
	// GetMapping("/sony")
	// GetMapping is a composed annotation thatacts as a shortcut for
	// @RequestMapping(method = RequestMethod.GET)
	Iterable<Led> getAllLeds() {
		return leds;

	}

}
