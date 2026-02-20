package org.example;

import java.util.List;

public class Output {

    public String getRevisions(List<Revision> revisions) {
        if (revisions == null || revisions.isEmpty()) {
            return "No revisions found";
        }
        int i = 1;
        String formatted = "";
        for (Revision revision : revisions) {
            formatted += i + " " + revision.getTimestamp() + " " + revision.getUser() + "\n";
            i++;
        }
        return formatted;
    }

    public String getRedirect(String target) {
        if (target != null) {
            return "Redirected to " + target+"\n";
        }
        return "";
    }
}
