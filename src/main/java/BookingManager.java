/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.SQLException;
import java.util.List;

public class BookingManager {

    private HotelDao dao;

    public BookingManager(HotelDao dao) {
        this.dao = dao;
    }

    public boolean checkRoomAvailability(String roomName) throws SQLException {

        List<String> roomsAvailable = dao.fetchAvailableRooms();
        return roomsAvailable.contains(roomName);
    }

}