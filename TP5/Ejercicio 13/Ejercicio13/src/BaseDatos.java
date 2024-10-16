public class BaseDatos {
        private static BaseDatos instance;
    
        private BaseDatos() {
        }
    
        public static synchronized BaseDatos getInstance() {
            if (instance == null) {
                instance = new BaseDatos();
            }
            return instance;
        }
    
        public void saveData(String data) {
    
        }
    
        public String getData(String query) {
            return "data";
        }
    }
    
