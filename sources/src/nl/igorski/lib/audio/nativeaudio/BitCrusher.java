/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package nl.igorski.lib.audio.nativeaudio;

public class BitCrusher extends BaseProcessor {
  private long swigCPtr;

  protected BitCrusher(long cPtr, boolean cMemoryOwn) {
    super(NativeAudioEngineJNI.BitCrusher_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BitCrusher obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        NativeAudioEngineJNI.delete_BitCrusher(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public BitCrusher(float amount, float inputMix, float outputMix) {
    this(NativeAudioEngineJNI.new_BitCrusher(amount, inputMix, outputMix), true);
  }

  public float getAmount() {
    return NativeAudioEngineJNI.BitCrusher_getAmount(swigCPtr, this);
  }

  public void setAmount(float value) {
    NativeAudioEngineJNI.BitCrusher_setAmount(swigCPtr, this, value);
  }

  public float getInputMix() {
    return NativeAudioEngineJNI.BitCrusher_getInputMix(swigCPtr, this);
  }

  public void setInputMix(float value) {
    NativeAudioEngineJNI.BitCrusher_setInputMix(swigCPtr, this, value);
  }

  public float getOutputMix() {
    return NativeAudioEngineJNI.BitCrusher_getOutputMix(swigCPtr, this);
  }

  public void setOutputMix(float value) {
    NativeAudioEngineJNI.BitCrusher_setOutputMix(swigCPtr, this, value);
  }

  public void process(SWIGTYPE_p_AudioBuffer sampleBuffer, boolean isMonoSource) {
    NativeAudioEngineJNI.BitCrusher_process(swigCPtr, this, SWIGTYPE_p_AudioBuffer.getCPtr(sampleBuffer), isMonoSource);
  }

  public boolean isCacheable() {
    return NativeAudioEngineJNI.BitCrusher_isCacheable(swigCPtr, this);
  }

}
