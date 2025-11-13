package infra.eventstore;

import core.events.Event;
import modules.cliente.infra.conexao.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class EventStore {

    public static void append(Event event) {

        String query ="""
                      INSERT INTO EventStore
                      (aggregate_type, aggregate_id, event_type, event_data)
                      VALUES (?, ?, ?, ?)
                      """;
        ;

        try (Connection conn = ConnectionDB.connect();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, event.getAggregateType());
            stmt.setInt(2, event.getAggregateId());
            stmt.setString(3, event.getEventType());
            stmt.setString(4, event.toJson());

            int affected = stmt.executeUpdate();
            if (affected == 0) {
                throw new RuntimeException("Falha ao cadastrar cliente, nenhuma linha afetada.");
            }
    } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
