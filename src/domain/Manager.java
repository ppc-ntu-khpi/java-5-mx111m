package domain;
     * @param dept відділ
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Повертає інформацію про менеджера.
     *
     * @return інформація про менеджера
     */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees();
    }

    /**
     * Створює менеджера зі списком працівників.
     *
     * @param employees список працівників
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    
    /**
     * Створює менеджера за замовчуванням.
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;

    /**
     * Повертає список працівників.
     *
     * @return список працівників
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює список працівників.
     *
     * @param employees список працівників
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    /**
     * Повертає масив працівників.
     *
     * @return масив працівників
     */
    public Employee[] getEmployeesList() {
        return employees;
    }
}
