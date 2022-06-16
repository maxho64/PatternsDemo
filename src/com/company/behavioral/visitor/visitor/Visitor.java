package com.company.behavioral.visitor.visitor;

import com.company.behavioral.visitor.shapes.Circle;
import com.company.behavioral.visitor.shapes.CompoundShape;
import com.company.behavioral.visitor.shapes.Dot;
import com.company.behavioral.visitor.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}