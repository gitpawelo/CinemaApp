package model.dao;

import model.Reservation;
import utility.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import presenter.ReservationPresenter;


public class ReservationDAOImplement implements ReservationPresenter {

    public Integer addReservation(Reservation reservation) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        Integer reservationID = null;

        try {
            tx = session.beginTransaction();
            reservationID = (Integer) session.save(reservation);
            tx.commit();


        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();

        }
        return reservationID;
    }
}
