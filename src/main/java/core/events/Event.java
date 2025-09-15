package core.events;

public abstract class Event {
    private final int aggregateId;

    public Event(int aggregateId) {
        this.aggregateId = aggregateId;
    }

    public int getAggregateId() {
        return aggregateId;
    }

    public abstract String getAggregateType();
    public abstract String getEventType();
    public abstract String toJson();
}
