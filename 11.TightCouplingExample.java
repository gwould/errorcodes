interface Printer {
    void print(String message);
}

class ConsolePrinter implements Printer {
    public void print(String message) {
        System.out.println(message);
    }
}

class Report {
    private Printer printer;
    public Report(Printer printer) {
        this.printer = printer;
    }
    void generate() {
        printer.print("Generating report...");
    }
}
