package at.ac.fhcampuswien;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


    public class checkPassword {

            @Test
            public void test() {
                App test = new App();
                boolean output = test.passwordInstructions("Nidia30Joby@Jose");
                assertEquals(true, output);
            }

            @Test
            public void test2() {
                App test = new App();
                boolean output = test.passwordInstructions("NidiaJobyJose@");
                assertEquals(false, output);
            }

            @Test
            public void test3() {
                App test = new App();
                boolean output = test.passwordInstructions("nidiajobyjose");
                assertEquals(false, output);
            }

        @Test
        public void test4() {
            App test = new App();
            boolean output = test.passwordInstructions("NIDIAJOBYJOSE");
            assertEquals(false, output);
        }

        @Test
        public void test5() {
            App test = new App();
            boolean output = test.checkLength("nidiajobyjose");
            assertEquals(true, output);
        }

        @Test
        public void test6() {
            App test = new App();
            boolean output = test.checkLength("try");
            assertEquals(false, output);
        }

        @Test
        public void test7() {
            App test = new App();
            boolean output = test.checkLength("dushdhsflfiyfsuifhdufhusyhfjiysfhfduhdjkd");
            assertEquals(false, output);
        }
        @Test
        public void test8() {
            App test = new App();
            boolean output = test.addition("Nidia@1111");
            assertEquals(false, output);
        }
        @Test
        public void test9() {
            App test = new App();
            boolean output = test.addition("Nidia@123456");
            assertEquals(false, output);
        }
    }


