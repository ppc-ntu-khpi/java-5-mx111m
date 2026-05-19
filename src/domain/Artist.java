package domain;

/**
 * Клас Artist описує творчого працівника компанії.
 * Зберігає набір професійних навичок.
 */
public class Artist extends Employee {

    private String[] skiils;

    /**
     * Створює художника з навичками та основними даними.
     *
     * @param skiils навички працівника
     * @param name ім'я працівника
     * @param jobTitle посада
     * @param level рівень
     * @param dept відділ
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    /**
     * Створює художника з набором навичок.
     *
     * @param skiils навички працівника
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }

    /**
     * Створює художника за замовчуванням.
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    /**
     * Повертає список навичок у вигляді рядка.
     *
     * @return список навичок
     */
    @Override
    public String toString() {
        return super.toString() + "\nSkills: " + getSkills();
    }

    /**
     * Повертає навички у вигляді рядка.
     *
     * @return список навичок
     */
    public String getSkills() {
        String s = "";

        for (String e : skiils) {
            s = s + e + ", ";
        }

        s = s.substring(0, s.length() - 2);

        return s;
    }

    /**
     * Встановлює навички працівника.
     *
     * @param skills набір навичок
     */
    public void setSkills(String[] skills) {
        this.skiils = skills;
    }

    /**
     * Повертає масив навичок.
     *
     * @return масив навичок
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
