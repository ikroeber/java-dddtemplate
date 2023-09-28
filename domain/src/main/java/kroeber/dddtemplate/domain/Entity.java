package kroeber.dddtemplate.domain;

public abstract class Entity<T extends ValueObject> {
    private T id;

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        return id.equals(((Entity<?>) obj).getId());
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
