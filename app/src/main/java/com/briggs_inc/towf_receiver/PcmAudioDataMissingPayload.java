package com.briggs_inc.towf_receiver;

/**
 * Created by briggsm on 4/19/15.
 */
public class PcmAudioDataMissingPayload extends PcmAudioDataPayload {

    public PcmAudioDataMissingPayload() {
        super();
    }

    // Copy constructor
    PcmAudioDataMissingPayload(PcmAudioDataPayload adp) {
        super(adp);
    }

    public PcmAudioDataMissingPayload(SeqId seqId) {
        super(seqId);
    }
}
