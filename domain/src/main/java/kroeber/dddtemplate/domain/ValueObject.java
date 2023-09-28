package kroeber.dddtemplate.domain;

import java.util.Arrays;
import java.util.Objects;

public abstract class ValueObject {
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return isEqualTo((ValueObject) obj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEqualityFields());
    }

    protected abstract Object[] getEqualityFields();

    private boolean isEqualTo(ValueObject other) {
        return Arrays.deepEquals(getEqualityFields(), other.getEqualityFields());
    }
}
