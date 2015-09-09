/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package nl.igorski.lib.audio.nativeaudio;

public class BufferUtility {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected BufferUtility(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BufferUtility obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        NativeAudioEngineJNI.delete_BufferUtility(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static double getBPMbyLength(double length, int amountOfBars) {
    return NativeAudioEngineJNI.BufferUtility_getBPMbyLength(length, amountOfBars);
  }

  public static double getBPMbySamples(int length, int amountOfBars, int sampleRate) {
    return NativeAudioEngineJNI.BufferUtility_getBPMbySamples(length, amountOfBars, sampleRate);
  }

  public static int bufferToMilliseconds(int bufferSize, int sampleRate) {
    return NativeAudioEngineJNI.BufferUtility_bufferToMilliseconds(bufferSize, sampleRate);
  }

  public static int millisecondsToBuffer(int milliSeconds, int sampleRate) {
    return NativeAudioEngineJNI.BufferUtility_millisecondsToBuffer(milliSeconds, sampleRate);
  }

  public static int getBitRate(int sampleRate, int bitDepth, int channels) {
    return NativeAudioEngineJNI.BufferUtility_getBitRate(sampleRate, bitDepth, channels);
  }

  public static int calculateSamplesPerBeatDivision(int sampleRate, double tempo, int subdivision) {
    return NativeAudioEngineJNI.BufferUtility_calculateSamplesPerBeatDivision(sampleRate, tempo, subdivision);
  }

  public static int getSamplesPerBeat(int sampleRate, double tempo) {
    return NativeAudioEngineJNI.BufferUtility_getSamplesPerBeat(sampleRate, tempo);
  }

  public static int getSamplesPerBar(int sampleRate, double tempo, int beatAmount, int beatUnit) {
    return NativeAudioEngineJNI.BufferUtility_getSamplesPerBar(sampleRate, tempo, beatAmount, beatUnit);
  }

  public static int calculateBufferLength(SWIGTYPE_p_SAMPLE_TYPE aMinRate) {
    return NativeAudioEngineJNI.BufferUtility_calculateBufferLength__SWIG_0(SWIGTYPE_p_SAMPLE_TYPE.getCPtr(aMinRate));
  }

  public static int calculateBufferLength(int milliSeconds) {
    return NativeAudioEngineJNI.BufferUtility_calculateBufferLength__SWIG_1(milliSeconds);
  }

  public static SWIGTYPE_p_SAMPLE_TYPE generateSilentBuffer(int aBufferSize) {
    long cPtr = NativeAudioEngineJNI.BufferUtility_generateSilentBuffer(aBufferSize);
    return (cPtr == 0) ? null : new SWIGTYPE_p_SAMPLE_TYPE(cPtr, false);
  }

  public static void bufferToFile(String aFileName, SWIGTYPE_p_SAMPLE_TYPE aBuffer, int aBufferLength) {
    NativeAudioEngineJNI.BufferUtility_bufferToFile(aFileName, SWIGTYPE_p_SAMPLE_TYPE.getCPtr(aBuffer), aBufferLength);
  }

  public BufferUtility() {
    this(NativeAudioEngineJNI.new_BufferUtility(), true);
  }

}