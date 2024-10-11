package org.emrick.project.effect;

public interface RFTriggerListener {
    void onCreateRFTrigger(RFTrigger rfTrigger);
    void onDeleteRFTrigger(int count);
    void onUpdateRFTrigger(RFTrigger rfTrigger, int count);
    void onPressRFTrigger(RFTrigger rfTrigger);
}
