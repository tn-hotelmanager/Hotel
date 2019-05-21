
package model;

import java.time.LocalDate;

public class Search {
    private String name;
    private int number;
    private LocalDate start;
    private LocalDate end;

    public Search() {
    }

    public Search(String name, int number, LocalDate start, LocalDate end) {
        this.name = name;
        this.number = number;
        this.start = start;
        this.end = end;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }
    
    
}
