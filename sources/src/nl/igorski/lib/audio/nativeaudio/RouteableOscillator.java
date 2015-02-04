/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package nl.igorski.lib.audio.nativeaudio;

public class RouteableOscillator {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected RouteableOscillator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RouteableOscillator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        NativeAudioEngineJNI.delete_RouteableOscillator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public RouteableOscillator() {
    this(NativeAudioEngineJNI.new_RouteableOscillator(), true);
  }

  public void setDestination(int value) {
    NativeAudioEngineJNI.RouteableOscillator_destination_set(swigCPtr, this, value);
  }

  public int getDestination() {
    return NativeAudioEngineJNI.RouteableOscillator_destination_get(swigCPtr, this);
  }

  public void setSpeed(float value) {
    NativeAudioEngineJNI.RouteableOscillator_speed_set(swigCPtr, this, value);
  }

  public float getSpeed() {
    return NativeAudioEngineJNI.RouteableOscillator_speed_get(swigCPtr, this);
  }

  public void setWave(int value) {
    NativeAudioEngineJNI.RouteableOscillator_wave_set(swigCPtr, this, value);
  }

  public int getWave() {
    return NativeAudioEngineJNI.RouteableOscillator_wave_get(swigCPtr, this);
  }

  public void linkOscillator() {
    NativeAudioEngineJNI.RouteableOscillator_linkOscillator(swigCPtr, this);
  }

  public void unlinkOscillator() {
    NativeAudioEngineJNI.RouteableOscillator_unlinkOscillator(swigCPtr, this);
  }

  public boolean isLinked() {
    return NativeAudioEngineJNI.RouteableOscillator_isLinked(swigCPtr, this);
  }

  public LFO getLinkedOscillator() {
    long cPtr = NativeAudioEngineJNI.RouteableOscillator_getLinkedOscillator(swigCPtr, this);
    return (cPtr == 0) ? null : new LFO(cPtr, false);
  }

}
