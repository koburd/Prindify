package ee.taltech.prindify.service.validation;

import ee.taltech.prindify.model.basket.Item;
import org.springframework.stereotype.Service;

@Service
public interface ItemValidationService {

    boolean validate(Item item);
}
