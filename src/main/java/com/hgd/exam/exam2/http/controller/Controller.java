package com.hgd.exam.exam2.http.controller;

import com.hgd.exam.exam2.container.ContainerComponent;
import com.hgd.exam.exam2.http.Rq;

public abstract class Controller implements ContainerComponent {
	public abstract void performAction(Rq rq);
}
