package com.nice.cea.strategy;

import lombok.Setter;
import lombok.experimental.Delegate;

/**
 * @author Evgeny Borisov
 */
@Setter
public class RadioAlarm implements Radio,Alarm {
    @Delegate
    private Radio radio = new RadioImpl();
    @Delegate
    private Alarm alarm = new AlarmImpl();
}
