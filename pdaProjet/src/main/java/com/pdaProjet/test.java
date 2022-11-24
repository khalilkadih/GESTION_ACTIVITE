package com.pdaProjet;

import com.pdaProjet.Dao.ParticipantDao;
import com.pdaProjet.Entitys.Participants;

import java.util.List;

public class test
{
    public static void main(String[] args) {
        ParticipantDao participantDao= new ParticipantDao();
      List<Participants>lista= participantDao.showAllParticpant();
      lista.stream().forEach(System.out::println);




    }
}
