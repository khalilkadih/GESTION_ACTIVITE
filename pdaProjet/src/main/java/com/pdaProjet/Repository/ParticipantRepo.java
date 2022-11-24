package com.pdaProjet.Repository;

import com.pdaProjet.Dao.ParticipantDao;
import com.pdaProjet.Entitys.Participants;

import java.util.ArrayList;

public class ParticipantRepo {
    ParticipantDao participantDao= new ParticipantDao();
    public Participants addParticpant(Participants participants){
        return new ParticipantDao().insertEntity(participants);
    }
    public void delete(long id)
    {
        new ParticipantDao().removeEntity(id);
    }
    public ArrayList<Participants> showAllParticpant(){
        return  participantDao.showAllParticpant();
    }

}
