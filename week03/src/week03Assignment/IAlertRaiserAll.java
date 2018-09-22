package week03Assignment;

public interface IAlertRaiserAll extends IAlertRaiserUser{
	
	public abstract <E> E turnOffAllAlerts(E[] toBeAlerted);

}
