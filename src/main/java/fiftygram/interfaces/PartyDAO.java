package fiftygram.interfaces;

import fiftygram.model.Party;

public interface PartyDAO {

    public void insert(Party party);
    public Party findByPartyId(int partyId);
}
