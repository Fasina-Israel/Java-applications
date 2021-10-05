package CCValidator;

import org.junit.jupiter.api.Test;
import static CCValidator.CreditCardType.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CCTest {

    CreditCard cc = new CreditCard();

    @Test

    public void testThatLengthIsNotMoreThan16(){
        assertTrue(cc.validateLength(1111111111111L));

    }

    @Test

    public void testTheSumOfAllOddNumberFromRightLeft(){
        assertEquals(30, cc.sumOfDoubleOddPlace(2222222222222221L));
    }

    @Test

    public void testTheSumOfAllEvenNumberFromRightToLeft(){
        assertEquals(16 ,cc.sumOfDoubleEvenPlace(1111111111111112L));

    }
    @Test

    public void testToValidateVisaCard(){
        assertEquals(VISA_CARD,cc.validateCards(3764456567878532L));
    }

    @Test

    public void testToValidateAmericanExpressCard(){
        assertEquals(AMERICAN_EXPRESS_CARD,cc.validateCards(4764456567878532L));
    }

    @Test

    public void testToValidateMasterCard(){
        assertEquals(MASTER_CARD,cc.validateCards(5764456567878532L));
    }

    @Test

    public void testToValidateDiscoverCard(){
        assertEquals(DISCOVER_CARD,cc.validateCards(6764456567878532L));
    }

    @Test

    public void testToConfirmValidationByDividingBtTen(){
        assertTrue(cc.isValid(4388576018410727L));
    }

}