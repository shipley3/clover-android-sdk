/**
 * Autogenerated by Avro
 * 
 * DO NOT EDIT DIRECTLY
 */


/*
 * Copyright (C) 2013 Clover Network, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clover.sdk.v3.cash;

@SuppressWarnings("all")
public final class CashEvent implements android.os.Parcelable, com.clover.sdk.v3.Validator, com.clover.sdk.JSONifiable {


  private enum CacheKey {
    type {
      @Override
      public Object extractValue(CashEvent instance) {
        return instance.extractType();
      }
    },
    amountChange {
      @Override
      public Object extractValue(CashEvent instance) {
        return instance.extractAmountChange();
      }
    },
    timestamp {
      @Override
      public Object extractValue(CashEvent instance) {
        return instance.extractTimestamp();
      }
    },
    note {
      @Override
      public Object extractValue(CashEvent instance) {
        return instance.extractNote();
      }
    },
    employee {
      @Override
      public Object extractValue(CashEvent instance) {
        return instance.extractEmployee();
      }
    },
    device {
      @Override
      public Object extractValue(CashEvent instance) {
        return instance.extractDevice();
      }
    },
    ;

    public abstract Object extractValue(CashEvent instance);
  }

  private String jsonString = null;
  private org.json.JSONObject jsonObject = null;
  private android.os.Bundle bundle = null;
  private android.os.Bundle changeLog = null;
  private Object[] cache = null;
  private byte[] cacheState = null;

  private static final byte STATE_NOT_CACHED = 0;
  private static final byte STATE_CACHED_NO_VALUE = 1;
  private static final byte STATE_CACHED_VALUE = 2;

  /**
   * Constructs a new empty instance.
   */
  public CashEvent() { }

  /**
   * Constructs a new instance from the given JSON String.
   */
  public CashEvent(String json) {
    this.jsonString = json;
  }

  /**
   * Construct a new instance backed by the given JSONObject, the parameter is not copied so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public CashEvent(org.json.JSONObject jsonObject) {
    this.jsonObject = jsonObject;
  }

  /**
   * Constructs a new instance that is a deep copy of the source instance. It does not copy the bundle or changelog.
   */
  public CashEvent(CashEvent src) {
    if (src.jsonString != null) {
      this.jsonString = src.jsonString;
    } else {
      this.jsonObject = com.clover.sdk.v3.JsonHelper.deepCopy(src.getJSONObject());
    }
  }

  private <T> T cacheGet(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    return (T) cache[index];
  }

  private boolean cacheValueIsNotNull(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    return cache[index] != null;
  }

  private boolean cacheHasKey(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    return cacheState[index] == STATE_CACHED_VALUE;
  }

  private void cacheRemoveValue(CacheKey key) {
    int index = key.ordinal();
    populateCache(index);
    cache[index] = null;
    cacheState[index] = STATE_CACHED_NO_VALUE;
  }

  private void cacheMarkDirty(CacheKey key) {
    if (cache != null) {
      int index = key.ordinal();
      cache[index] = null;
      cacheState[index] = STATE_NOT_CACHED;
    }
  }

  private void populateCache(int index) {
    if (cache == null) {
      int size = CacheKey.values().length;
      cache = new Object[size];
      cacheState = new byte[size];
    }

    if (cacheState[index] == STATE_NOT_CACHED) {
      CacheKey key = CacheKey.values()[index];

      if (getJSONObject().has(key.name())) {
        cache[index] = key.extractValue(this);
        cacheState[index] = STATE_CACHED_VALUE;
      } else {
        cacheState[index] = STATE_CACHED_NO_VALUE;
      }
    }
  }

  /**
   * Returns the internal JSONObject backing this instance, the return value is not a copy so changes to it will be
   * reflected in this instance and vice-versa.
   */
  public org.json.JSONObject getJSONObject() {
    try {
      if (jsonObject == null) {
        if (jsonString != null) {
          jsonObject = new org.json.JSONObject(jsonString);
          jsonString = null; // null this so it will be recreated if jsonObject is modified
        } else {
          jsonObject = new org.json.JSONObject();
        }
      }
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }
    return jsonObject;
  }


  @Override
  public void validate() {
  }


  /**
   * The type of event that occured
   */
  public com.clover.sdk.v3.cash.Type getType() {
    return cacheGet(CacheKey.type);
  }

  private com.clover.sdk.v3.cash.Type extractType() {
    if (!getJSONObject().isNull("type")) {
      try {
        return com.clover.sdk.v3.cash.Type.valueOf(getJSONObject().optString("type"));
      } catch(Exception e) {
        e.printStackTrace();
      }
    }

    return null;
  }

  /**
   * The amount that was either added, removed of modified by the event
   */
  public java.lang.Long getAmountChange() {
    return cacheGet(CacheKey.amountChange);
  }

  private java.lang.Long extractAmountChange() {
    return getJSONObject().isNull("amountChange") ? null :
      getJSONObject().optLong("amountChange");
  }

  /**
   * Time at which the event was exectued
   */
  public java.lang.Long getTimestamp() {
    return cacheGet(CacheKey.timestamp);
  }

  private java.lang.Long extractTimestamp() {
    return getJSONObject().isNull("timestamp") ? null :
      getJSONObject().optLong("timestamp");
  }

  /**
   * Any additional information regarding the event
   */
  public java.lang.String getNote() {
    return cacheGet(CacheKey.note);
  }

  private java.lang.String extractNote() {
    return getJSONObject().isNull("note") ? null :
      getJSONObject().optString("note");
  }

  /**
   * The employee who performed the event
   *
   * The returned object is not a copy so changes to it will be reflected in this instance and vice-versa.
   */
  public com.clover.sdk.v3.employees.Employee getEmployee() {
    return cacheGet(CacheKey.employee);
  }

  private com.clover.sdk.v3.employees.Employee extractEmployee() {
    org.json.JSONObject jsonObj = getJSONObject().optJSONObject("employee");
    if (jsonObj != null) {
      return new com.clover.sdk.v3.employees.Employee(getJSONObject().optJSONObject("employee"));
    }
    return null;
  }

  /**
   * The device that initiated the event
   *
   * The returned object is not a copy so changes to it will be reflected in this instance and vice-versa.
   */
  public com.clover.sdk.v3.device.Device getDevice() {
    return cacheGet(CacheKey.device);
  }

  private com.clover.sdk.v3.device.Device extractDevice() {
    org.json.JSONObject jsonObj = getJSONObject().optJSONObject("device");
    if (jsonObj != null) {
      return new com.clover.sdk.v3.device.Device(getJSONObject().optJSONObject("device"));
    }
    return null;
  }


  /** Checks whether the 'type' field is set and is not null */
  public boolean isNotNullType() {
    return cacheValueIsNotNull(CacheKey.type);
  }

  /** Checks whether the 'amountChange' field is set and is not null */
  public boolean isNotNullAmountChange() {
    return cacheValueIsNotNull(CacheKey.amountChange);
  }

  /** Checks whether the 'timestamp' field is set and is not null */
  public boolean isNotNullTimestamp() {
    return cacheValueIsNotNull(CacheKey.timestamp);
  }

  /** Checks whether the 'note' field is set and is not null */
  public boolean isNotNullNote() {
    return cacheValueIsNotNull(CacheKey.note);
  }

  /** Checks whether the 'employee' field is set and is not null */
  public boolean isNotNullEmployee() {
    return cacheValueIsNotNull(CacheKey.employee);
  }

  /** Checks whether the 'device' field is set and is not null */
  public boolean isNotNullDevice() {
    return cacheValueIsNotNull(CacheKey.device);
  }


  /** Checks whether the 'type' field has been set, however the value could be null */
  public boolean hasType() {
    return cacheHasKey(CacheKey.type);
  }

  /** Checks whether the 'amountChange' field has been set, however the value could be null */
  public boolean hasAmountChange() {
    return cacheHasKey(CacheKey.amountChange);
  }

  /** Checks whether the 'timestamp' field has been set, however the value could be null */
  public boolean hasTimestamp() {
    return cacheHasKey(CacheKey.timestamp);
  }

  /** Checks whether the 'note' field has been set, however the value could be null */
  public boolean hasNote() {
    return cacheHasKey(CacheKey.note);
  }

  /** Checks whether the 'employee' field has been set, however the value could be null */
  public boolean hasEmployee() {
    return cacheHasKey(CacheKey.employee);
  }

  /** Checks whether the 'device' field has been set, however the value could be null */
  public boolean hasDevice() {
    return cacheHasKey(CacheKey.device);
  }


  /**
   * Sets the field 'type'.
   */
  public CashEvent setType(com.clover.sdk.v3.cash.Type type) {
    logChange("type");

    try {
      getJSONObject().put("type", type == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(type));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.type);
    return this;
  }

  /**
   * Sets the field 'amountChange'.
   */
  public CashEvent setAmountChange(java.lang.Long amountChange) {
    logChange("amountChange");

    try {
      getJSONObject().put("amountChange", amountChange == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(amountChange));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.amountChange);
    return this;
  }

  /**
   * Sets the field 'timestamp'.
   */
  public CashEvent setTimestamp(java.lang.Long timestamp) {
    logChange("timestamp");

    try {
      getJSONObject().put("timestamp", timestamp == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(timestamp));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.timestamp);
    return this;
  }

  /**
   * Sets the field 'note'.
   */
  public CashEvent setNote(java.lang.String note) {
    logChange("note");

    try {
      getJSONObject().put("note", note == null ? org.json.JSONObject.NULL : com.clover.sdk.v3.JsonHelper.toJSON(note));
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.note);
    return this;
  }

  /**
   * Sets the field 'employee'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public CashEvent setEmployee(com.clover.sdk.v3.employees.Employee employee) {
    logChange("employee");

    try {
      getJSONObject().put("employee",
          employee == null ? org.json.JSONObject.NULL : employee.getJSONObject());
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.employee);
    return this;
  }

  /**
   * Sets the field 'device'.
   *
   * The parameter is not copied so changes to it will be reflected in this instance and vice-versa.
   */
  public CashEvent setDevice(com.clover.sdk.v3.device.Device device) {
    logChange("device");

    try {
      getJSONObject().put("device",
          device == null ? org.json.JSONObject.NULL : device.getJSONObject());
    } catch (org.json.JSONException e) {
      throw new java.lang.IllegalArgumentException(e);
    }

    cacheMarkDirty(CacheKey.device);
    return this;
  }


  /** Clears the 'type' field, the 'has' method for this field will now return false */
  public void clearType() {
    unlogChange("type");
    getJSONObject().remove("type");
    cacheRemoveValue(CacheKey.type);
  }

  /** Clears the 'amountChange' field, the 'has' method for this field will now return false */
  public void clearAmountChange() {
    unlogChange("amountChange");
    getJSONObject().remove("amountChange");
    cacheRemoveValue(CacheKey.amountChange);
  }

  /** Clears the 'timestamp' field, the 'has' method for this field will now return false */
  public void clearTimestamp() {
    unlogChange("timestamp");
    getJSONObject().remove("timestamp");
    cacheRemoveValue(CacheKey.timestamp);
  }

  /** Clears the 'note' field, the 'has' method for this field will now return false */
  public void clearNote() {
    unlogChange("note");
    getJSONObject().remove("note");
    cacheRemoveValue(CacheKey.note);
  }

  /** Clears the 'employee' field, the 'has' method for this field will now return false */
  public void clearEmployee() {
    unlogChange("employee");
    getJSONObject().remove("employee");
    cacheRemoveValue(CacheKey.employee);
  }

  /** Clears the 'device' field, the 'has' method for this field will now return false */
  public void clearDevice() {
    unlogChange("device");
    getJSONObject().remove("device");
    cacheRemoveValue(CacheKey.device);
  }


  private void logChange(java.lang.String field) {
    if (changeLog == null) {
      changeLog = new android.os.Bundle();
    }
    changeLog.putString(field, null);
  }

  private void unlogChange(java.lang.String field) {
    if (changeLog != null) {
      changeLog.remove(field);
    }
  }

  /**
   * Returns true if this instance has any changes.
   */
  public boolean containsChanges() {
    return changeLog != null;
  }

  /**
   * Reset the log of changes made to this instance, calling copyChanges() after this would return an empty instance.
   */
  public void resetChangeLog() {
    changeLog = null;
  }

  /**
   * Create a copy of this instance that contains only fields that were set after the constructor was called.
   */
  public CashEvent copyChanges() {
    CashEvent copy = new CashEvent();
    copy.mergeChanges(this);
    copy.resetChangeLog();
    return copy;
  }

  /**
   * Copy all the changed fields from the given source to this instance.
   */
  public void mergeChanges(CashEvent src) {
    if (src.changeLog != null) {
      try {
        // Make a copy of the source so the destination fields are copies
        org.json.JSONObject srcObj = new CashEvent(src).getJSONObject();
        org.json.JSONObject dstObj = getJSONObject();
        for (java.lang.String field : src.changeLog.keySet()) {
          dstObj.put(field, srcObj.get(field));
          logChange(field);
        }
      } catch (org.json.JSONException e) {
        throw new java.lang.IllegalArgumentException(e);
      }
    }
  }


  /**
   * Gets a Bundle which can be used to get and set data attached to this instance. The attached Bundle will be
   * parcelled but not jsonified.
   */
  public android.os.Bundle getBundle() {
    if (bundle == null) {
      bundle = new android.os.Bundle();
    }
    return bundle;
  }

  @Override
  public String toString() {
    String json = jsonString != null ? jsonString : getJSONObject().toString();

    if (bundle != null) {
      bundle.isEmpty(); // Triggers unparcel
    }

    if (changeLog != null) {
      changeLog.isEmpty(); // Triggers unparcel
    }

    return "CashEvent{" +
        "json='" + json + "'" +
        ", bundle=" + bundle +
        ", changeLog=" + changeLog +
        '}';
  }

  @Override
  public int describeContents() {
    return 0;
  }

  @Override
  public void writeToParcel(android.os.Parcel dest, int flags) {
	  com.clover.sdk.v3.JsonParcelHelper.wrap(getJSONObject()).writeToParcel(dest, 0);
    dest.writeBundle(bundle);
    dest.writeBundle(changeLog);
  }

  public static final android.os.Parcelable.Creator<CashEvent> CREATOR = new android.os.Parcelable.Creator<CashEvent>() {
    @Override
    public CashEvent createFromParcel(android.os.Parcel in) {
      CashEvent instance = new CashEvent(com.clover.sdk.v3.JsonParcelHelper.ObjectWrapper.CREATOR.createFromParcel(in).unwrap());
      instance.bundle = in.readBundle();
      instance.changeLog = in.readBundle();
      return instance;
    }

    @Override
    public CashEvent[] newArray(int size) {
      return new CashEvent[size];
    }
  };

  public static final com.clover.sdk.JSONifiable.Creator<CashEvent> JSON_CREATOR = new com.clover.sdk.JSONifiable.Creator<CashEvent>() {
    @Override
    public CashEvent create(org.json.JSONObject jsonObject) {
      return new CashEvent(jsonObject);
    }
  };


  public interface Constraints {

    public static final boolean TYPE_IS_REQUIRED = false;

    public static final boolean AMOUNTCHANGE_IS_REQUIRED = false;

    public static final boolean TIMESTAMP_IS_REQUIRED = false;

    public static final boolean NOTE_IS_REQUIRED = false;

    public static final boolean EMPLOYEE_IS_REQUIRED = false;

    public static final boolean DEVICE_IS_REQUIRED = false;

  }

}
