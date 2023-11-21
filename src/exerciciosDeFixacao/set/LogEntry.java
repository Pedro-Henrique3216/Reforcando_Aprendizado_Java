package exerciciosDeFixacao.set;

import java.time.LocalDateTime;
import java.util.Objects;

public class LogEntry {

    private String username;
    private LocalDateTime date;

    public LogEntry(String username, LocalDateTime date) {
        this.username = username;
        this.date = date;
    }

    @Override
    public String toString() {
        return "LogEntry{" +
                "username='" + username + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogEntry logEntry = (LogEntry) o;
        return Objects.equals(username, logEntry.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }
}
