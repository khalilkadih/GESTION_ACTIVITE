package com.pdaProjet.Service;

import com.pdaProjet.Entitys.Participants;
import com.pdaProjet.Repository.ParticipantRepo;

import java.util.ArrayList;

public class ParticpantService {

    ParticipantRepo participantRepo= new ParticipantRepo();

    public Participants addParticpant(Participants participants){
        return new ParticipantRepo().addParticpant(participants);
    }
    public void delete(Long id){
        new ParticipantRepo().delete(id);
    }
    public ArrayList<Participants> showALLPartcicpant(){

       return  participantRepo.showAllParticpant();
    }
}
