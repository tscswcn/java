package new1;

import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.Test;

public class Assumption {
         @Test
        void assumeTrueTest() {
        
            assumeTrue(false);
            System.out.println("This will not be implemented.");
        }

        @Test
        void assumeFalseTest() {
 
            assumeFalse(true);
            System.out.println("This will not be implemented.");
        }

        @Test
        void assumingThatTest() {
        	assumingThat(false,
                () -> {
                    System.out.println("This will not be implemented.");
                });

          
            System.out.println("This will be implemented.");
        }
}