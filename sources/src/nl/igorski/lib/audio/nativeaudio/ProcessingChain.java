/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package nl.igorski.lib.audio.nativeaudio;

public class ProcessingChain {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected ProcessingChain(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ProcessingChain obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        NativeAudioEngineJNI.delete_ProcessingChain(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ProcessingChain() {
    this(NativeAudioEngineJNI.new_ProcessingChain(), true);
  }

  public SWIGTYPE_p_std__vectorT_BaseProcessor_p_t getActiveProcessors() {
    return new SWIGTYPE_p_std__vectorT_BaseProcessor_p_t(NativeAudioEngineJNI.ProcessingChain_getActiveProcessors(swigCPtr, this), true);
  }

  public void addProcessor(BaseProcessor aProcessor) {
    NativeAudioEngineJNI.ProcessingChain_addProcessor(swigCPtr, this, BaseProcessor.getCPtr(aProcessor), aProcessor);
  }

  public void removeProcessor(BaseProcessor aProcessor) {
    NativeAudioEngineJNI.ProcessingChain_removeProcessor(swigCPtr, this, BaseProcessor.getCPtr(aProcessor), aProcessor);
  }

  public void reset() {
    NativeAudioEngineJNI.ProcessingChain_reset(swigCPtr, this);
  }

}
