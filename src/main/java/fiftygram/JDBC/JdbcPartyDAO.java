package fiftygram.JDBC;


import fiftygram.interfaces.PartyDAO;
import fiftygram.model.Party;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class JdbcPartyDAO implements PartyDAO {
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void insert(Party party) {
        String sql = "INSERT INTO Party " + "(" +
                "id, " +
                "OwnerId, " +
                "Name, " +
                "Description, " +
                "DateBegin, " +
                "DateEnd, " +
                "MaxGuests, " +
                "LocationCoordinatesHorizontal, " +
                "LocationCoordinatesVertical, " +
                "LocationAddress, " +
                "AccessType, " +
                "Type, " +
                "Price) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        Connection conn = null;

        try {
            conn = dataSource.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, party.id);
            ps.setInt(2, party.OwnerId);
            ps.setString(3, party.Name);
            ps.setString(4, party.Description);
            ps.setDate(5, party.DateBegin);
            ps.setDate(6, party.DateEnd);
            ps.setInt(7, party.MaxGuests);
            ps.setDouble(8, party.LocationCoordinatesHorizontal);
            ps.setDouble(9, party.LocationCoordinatesVertical);
            ps.setString(10, party.LocationAddress);
            ps.setString(11, party.AccessType);
            ps.setString(12, party.Type);
            ps.setInt(13, party.Price);

            ps.executeUpdate();
            ps.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {}
            }
        }
    }

    public Party findByPartyId(int PartyId) {
        String sql = "SELECT * FROM Party WHERE id = ?";

        Connection conn = null;

        try{
            conn = dataSource.getConnection();

            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, PartyId);

            Party party = null;
            ResultSet rs = ps.executeQuery();

            if(rs.next()) {
                party = new Party(
                    rs.getInt("id"),
                    rs.getInt("OwnerId"),
                    rs.getString("Name"),
                    rs.getString("Description"),
                    rs.getDate("DateBegin"),
                    rs.getDate("DateEnd"),
                    rs.getInt("MaxGuests"),
                    rs.getDouble("LocationCoordinatesHorizontal"),
                    rs.getDouble("LocationCoordinatesVertical"),
                    rs.getString("LocationAddress"),
                    rs.getString("AccessType"),
                    rs.getString("Type"),
                    rs.getInt("Price")
                );
            }

            rs.close();
            ps.close();
            return party;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if(conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {}
            }
        }
    }
}
