package domain;

/**
 * Клас Editor описує редактора.
 * Може працювати з електронним або паперовим редагуванням.
 */
public class Editor extends Artist {

    private boolean electronicEditing;

    /**
     * Створює редактора з параметрами.
     *
     * @param electronicEditing тип редагування
     * @param skiils навички
     * @param name ім'я
     * @param jobTitle посада
     * @param level рівень
     * @param dept відділ
     */
    public Editor(boolean electronicEditing, String[] skiils,
            String name, String jobTitle, int level, String dept) {

        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створює редактора з навичками.
     *
     * @param electronicEditing тип редагування
     * @param skiils навички
     */
    public Editor(boolean electronicEditing, String[] skiils) {

        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створює редактора.
     *
     * @param electronicEditing тип редагування
     */
    public Editor(boolean electronicEditing) {

        super();
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створює редактора за замовчуванням.
     */
    public Editor() {

        super();
        this.electronicEditing = true;
    }

    /**
     * Повертає інформацію про редактора.
     *
     * @return інформація про редактора
     */
    @Override
    public String toString() {

        String s = super.toString() + "\nEditing preferences= ";

        if (electronicEditing) {
            s = s + "electronic";
        } else {
            s = s + "paper";
        }

        return s;
    }

    /**
     * Повертає тип редагування.
     *
     * @return true якщо електронне редагування
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Встановлює тип редагування.
     *
     * @param electronic тип редагування
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing = electronic;
    }
}
