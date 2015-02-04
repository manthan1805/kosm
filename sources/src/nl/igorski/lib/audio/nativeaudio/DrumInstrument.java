/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package nl.igorski.lib.audio.nativeaudio;

public class DrumInstrument extends BaseInstrument {
  private long swigCPtr;

  protected DrumInstrument(long cPtr, boolean cMemoryOwn) {
    super(NativeAudioEngineJNI.DrumInstrument_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DrumInstrument obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        NativeAudioEngineJNI.delete_DrumInstrument(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public DrumInstrument() {
    this(NativeAudioEngineJNI.new_DrumInstrument(), true);
  }

  public SWIGTYPE_p_std__vectorT_BaseAudioEvent_p_t getEvents() {
    long cPtr = NativeAudioEngineJNI.DrumInstrument_getEvents(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__vectorT_BaseAudioEvent_p_t(cPtr, false);
  }

  public SWIGTYPE_p_std__vectorT_BaseAudioEvent_p_t getEventsForPattern(int patternNum) {
    long cPtr = NativeAudioEngineJNI.DrumInstrument_getEventsForPattern(swigCPtr, this, patternNum);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__vectorT_BaseAudioEvent_p_t(cPtr, false);
  }

  public SWIGTYPE_p_std__vectorT_BaseAudioEvent_p_t getEventsForActivePattern() {
    long cPtr = NativeAudioEngineJNI.DrumInstrument_getEventsForActivePattern(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__vectorT_BaseAudioEvent_p_t(cPtr, false);
  }

  public void setDrumTimbre(int value) {
    NativeAudioEngineJNI.DrumInstrument_drumTimbre_set(swigCPtr, this, value);
  }

  public int getDrumTimbre() {
    return NativeAudioEngineJNI.DrumInstrument_drumTimbre_get(swigCPtr, this);
  }

  public void setDrumPatterns(SWIGTYPE_p_std__vectorT_DrumPattern_p_t value) {
    NativeAudioEngineJNI.DrumInstrument_drumPatterns_set(swigCPtr, this, SWIGTYPE_p_std__vectorT_DrumPattern_p_t.getCPtr(value));
  }

  public SWIGTYPE_p_std__vectorT_DrumPattern_p_t getDrumPatterns() {
    long cPtr = NativeAudioEngineJNI.DrumInstrument_drumPatterns_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_std__vectorT_DrumPattern_p_t(cPtr, false);
  }

  public void setActiveDrumPattern(int value) {
    NativeAudioEngineJNI.DrumInstrument_activeDrumPattern_set(swigCPtr, this, value);
  }

  public int getActiveDrumPattern() {
    return NativeAudioEngineJNI.DrumInstrument_activeDrumPattern_get(swigCPtr, this);
  }

  public void setROsc(RouteableOscillator value) {
    NativeAudioEngineJNI.DrumInstrument_rOsc_set(swigCPtr, this, RouteableOscillator.getCPtr(value), value);
  }

  public RouteableOscillator getROsc() {
    long cPtr = NativeAudioEngineJNI.DrumInstrument_rOsc_get(swigCPtr, this);
    return (cPtr == 0) ? null : new RouteableOscillator(cPtr, false);
  }

  public boolean hasEvents() {
    return NativeAudioEngineJNI.DrumInstrument_hasEvents(swigCPtr, this);
  }

  public void updateEvents() {
    NativeAudioEngineJNI.DrumInstrument_updateEvents(swigCPtr, this);
  }

  public void clearEvents() {
    NativeAudioEngineJNI.DrumInstrument_clearEvents(swigCPtr, this);
  }

  public boolean removeEvent(BaseAudioEvent aEvent) {
    return NativeAudioEngineJNI.DrumInstrument_removeEvent(swigCPtr, this, BaseAudioEvent.getCPtr(aEvent), aEvent);
  }

  public DrumPattern getDrumPattern(int patternNum) {
    long cPtr = NativeAudioEngineJNI.DrumInstrument_getDrumPattern(swigCPtr, this, patternNum);
    return (cPtr == 0) ? null : new DrumPattern(cPtr, false);
  }

  public int setDrumPattern(DrumPattern pattern) {
    return NativeAudioEngineJNI.DrumInstrument_setDrumPattern(swigCPtr, this, DrumPattern.getCPtr(pattern), pattern);
  }

}