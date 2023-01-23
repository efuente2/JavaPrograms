package javaProblems;

public class CreateSingletonClass {

        private static CreateSingletonClass instance = null;

        public String s;

        private CreateSingletonClass() {
            s = "Hello this is a singleton class";
        }

        public static CreateSingletonClass getInstance() {
            if (instance == null)
                instance = new CreateSingletonClass();
            return instance;
        }
}
