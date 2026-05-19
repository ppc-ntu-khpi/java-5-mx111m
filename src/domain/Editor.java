package domain;
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
        String s=super.toString()+"\nEditing preferences= ";
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;
            
    }

    private boolean electronicEditing;

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
        this.electronicEditing=electronic;
    }
}
