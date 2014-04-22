package jetbrains.mps.langvisualization.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.PropertySupport;
import java.util.Iterator;
import jetbrains.mps.internal.collections.runtime.ListSequence;

public class PackageMapping_PropertySupport extends PropertySupport {
  public boolean canSetValue(String value) {
    if (value == null) {
      return true;
    }
    Iterator<PackageMapping> constants = ListSequence.fromList(PackageMapping.getConstants()).iterator();
    while (constants.hasNext()) {
      PackageMapping constant = constants.next();
      if (value.equals(constant.getName())) {
        return true;
      }
    }
    return false;
  }

  public String toInternalValue(String value) {
    if (value == null) {
      return null;
    }
    Iterator<PackageMapping> constants = ListSequence.fromList(PackageMapping.getConstants()).iterator();
    while (constants.hasNext()) {
      PackageMapping constant = constants.next();
      if (value.equals(constant.getName())) {
        return constant.getValueAsString();
      }
    }
    return null;
  }

  public String fromInternalValue(String value) {
    PackageMapping constant = PackageMapping.parseValue(value);
    if (constant != null) {
      return constant.getName();
    }
    return "";
  }
}