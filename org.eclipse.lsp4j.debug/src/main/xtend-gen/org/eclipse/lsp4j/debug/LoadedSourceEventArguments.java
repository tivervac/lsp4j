/**
 * Copyright (c) 2017 Kichwa Coders Ltd. and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.lsp4j.debug;

import org.eclipse.lsp4j.debug.LoadedSourceEventArgumentsReason;
import org.eclipse.lsp4j.debug.Source;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringBuilder;

/**
 * Event message for 'loadedSource' event type.
 * <p>
 * The event indicates that some source has been added, changed, or removed from the set of all loaded sources.
 */
@SuppressWarnings("all")
public class LoadedSourceEventArguments {
  /**
   * The reason for the event.
   */
  private LoadedSourceEventArgumentsReason reason;
  
  /**
   * The new, changed, or removed source.
   */
  private Source source;
  
  /**
   * The reason for the event.
   */
  @Pure
  public LoadedSourceEventArgumentsReason getReason() {
    return this.reason;
  }
  
  /**
   * The reason for the event.
   */
  public void setReason(final LoadedSourceEventArgumentsReason reason) {
    this.reason = reason;
  }
  
  /**
   * The new, changed, or removed source.
   */
  @Pure
  public Source getSource() {
    return this.source;
  }
  
  /**
   * The new, changed, or removed source.
   */
  public void setSource(final Source source) {
    this.source = source;
  }
  
  @Override
  @Pure
  public String toString() {
    ToStringBuilder b = new ToStringBuilder(this);
    b.add("reason", this.reason);
    b.add("source", this.source);
    return b.toString();
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    LoadedSourceEventArguments other = (LoadedSourceEventArguments) obj;
    if (this.reason == null) {
      if (other.reason != null)
        return false;
    } else if (!this.reason.equals(other.reason))
      return false;
    if (this.source == null) {
      if (other.source != null)
        return false;
    } else if (!this.source.equals(other.source))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this.reason== null) ? 0 : this.reason.hashCode());
    result = prime * result + ((this.source== null) ? 0 : this.source.hashCode());
    return result;
  }
}
