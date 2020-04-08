package guru.springframework.msscbeerservice.bootstrap;

import guru.springframework.msscbeerservice.domain.Beer;
import guru.springframework.msscbeerservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.UUID;

//@Component
public class BeerLoader implements CommandLineRunner {

    public static final String BEER_1_UPC = "0631234200036";
    public static final String BEER_2_UPC = "0631234300019";
    public static final String BEER_3_UPC = "0083783375213";
    public static final UUID BEER_1_UUID = UUID.fromString("68b1db4c-98ee-421d-acc3-05e88e4bec4f\t");
    public static final UUID BEER_2_UUID = UUID.fromString("e7260f99-dc8d-4c58-a786-2de75429c44d");
    public static final UUID BEER_3_UUID = UUID.fromString("96a2db80-8071-4dfe-9bbb-ced2e07ccf81");

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
//        loadBeerObjects();
    }

//    private void loadBeerObjects() {
//        if (beerRepository.count() == 0) {
//            beerRepository.save(Beer.builder()
//                    .beerName("Mango Bobs")
//                    .beerStyle("IPA")
//                    .quantityToBrew(200)
//                    .minOnHand(12)
//                    .upc(BEER_1_UPC)
//                    .price(new BigDecimal("12.95"))
//                    .build());
//
//            beerRepository.save(Beer.builder()
//                    .beerName("Galaxy Cat")
//                    .beerStyle("PALE_ALE")
//                    .quantityToBrew(200)
//                    .minOnHand(12)
//                    .upc(BEER_2_UPC)
//                    .price(new BigDecimal("11.95"))
//                    .build());
//
//            beerRepository.save(Beer.builder()
//                    .beerName("No Hammers On The Bar")
//                    .beerStyle("PALE_ALE")
//                    .quantityToBrew(200)
//                    .minOnHand(12)
//                    .upc(BEER_3_UPC)
//                    .price(new BigDecimal("11.95"))
//                    .build());
//        }
//    }
}
