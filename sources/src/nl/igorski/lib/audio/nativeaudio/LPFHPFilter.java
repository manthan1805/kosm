/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package nl.igorski.lib.audio.nativeaudio;

public class LPFHPFilter extends BaseProcessor {
  private long swigCPtr;

  protected LPFHPFilter(long cPtr, boolean cMemoryOwn) {
    super(NativeAudioEngineJNI.LPFHPFilter_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(LPFHPFilter obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        NativeAudioEngineJNI.delete_LPFHPFilter(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public LPFHPFilter(float aLPCutoff, float aHPCutoff, int amountOfChannels) {
    this(NativeAudioEngineJNI.new_LPFHPFilter(aLPCutoff, aHPCutoff, amountOfChannels), true);
  }

  public void setLPF(float aCutOffFrequency, int aSampleRate) {
    NativeAudioEngineJNI.LPFHPFilter_setLPF(swigCPtr, this, aCutOffFrequency, aSampleRate);
  }

  public void setHPF(float aCutOffFrequency, int aSampleRate) {
    NativeAudioEngineJNI.LPFHPFilter_setHPF(swigCPtr, this, aCutOffFrequency, aSampleRate);
  }

  public void process(SWIGTYPE_p_AudioBuffer sampleBuffer, boolean isMonoSource) {
    NativeAudioEngineJNI.LPFHPFilter_process(swigCPtr, this, SWIGTYPE_p_AudioBuffer.getCPtr(sampleBuffer), isMonoSource);
  }

}
