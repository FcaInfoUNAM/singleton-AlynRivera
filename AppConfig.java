public class AppConfig {
    private String theme;
    private String language;

    // 1. Instancia única (eager initialization)
    private static final AppConfig instance = new AppConfig();

    // 2. Constructor privado
    private AppConfig() {
        this.theme = "Light";
        this.language = "EN";
    }

    // 3. Método público para obtener la instancia
    public static AppConfig getInstance() {
        return instance;
    }

    // getters y setters
    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
