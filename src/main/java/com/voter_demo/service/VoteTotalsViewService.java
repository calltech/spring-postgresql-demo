package com.voter_demo.service;

import com.voter_demo.model.VoteTotalsView;

import java.util.List;

public interface VoteTotalsViewService {
    Iterable<VoteTotalsView> findAll();

    List<VoteTotalsView> findByElectionContains(String election);
}
