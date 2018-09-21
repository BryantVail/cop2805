package week03Assignment;

public interface IAlertRaiserAdmin extends IAlertRaiser{
	
	public abstract <E> E turnOffAllAlerts(E[] toBeAlerted);

}
