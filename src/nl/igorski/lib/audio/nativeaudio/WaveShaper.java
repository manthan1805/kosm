/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package nl.igorski.lib.audio.nativeaudio;

public class WaveShaper extends BaseProcessor {
  private long swigCPtr;

  protected WaveShaper(long cPtr, boolean cMemoryOwn) {
    super(NativeAudioEngineJNI.WaveShaper_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(WaveShaper obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        NativeAudioEngineJNI.delete_WaveShaper(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public WaveShaper(float amount, float level) {
    this(NativeAudioEngineJNI.new_WaveShaper(amount, level), true);
  }

  public float getAmount() {
    return NativeAudioEngineJNI.WaveShaper_getAmount(swigCPtr, this);
  }

  public void setAmount(float value) {
    NativeAudioEngineJNI.WaveShaper_setAmount(swigCPtr, this, value);
  }

  public float getLevel() {
    return NativeAudioEngineJNI.WaveShaper_getLevel(swigCPtr, this);
  }

  public void setLevel(float value) {
    NativeAudioEngineJNI.WaveShaper_setLevel(swigCPtr, this, value);
  }

  public void process(SWIGTYPE_p_AudioBuffer sampleBuffer, boolean isMonosource) {
    NativeAudioEngineJNI.WaveShaper_process(swigCPtr, this, SWIGTYPE_p_AudioBuffer.getCPtr(sampleBuffer), isMonosource);
  }

}