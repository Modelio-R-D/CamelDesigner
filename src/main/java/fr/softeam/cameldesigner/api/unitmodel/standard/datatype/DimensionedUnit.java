/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.unitmodel.standard.datatype;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link DataType} with << DimensionedUnit >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("2e234a26-ab74-44b2-9156-be36441cff03")
public abstract class DimensionedUnit extends Unit {
    @objid ("a7fd7f66-bbfd-4593-997d-8a0bb8687f39")
    public static final String STEREOTYPE_NAME = "DimensionedUnit";

    /**
     * Tells whether a {@link DimensionedUnit proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << DimensionedUnit >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9ce35215-d443-4540-8b61-d822597d6fa4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DimensionedUnit.STEREOTYPE_NAME));
    }

    @objid ("ee8f24e5-8a55-491b-800b-d8bb4c7c81ac")
    public static DimensionedUnit instantiate(final DataType obj) {
        return SingleUnit.canInstantiate(obj) ?  new SingleUnit(obj) : CompositeUnit.canInstantiate(obj) ? new CompositeUnit(obj) : null;
    }

    @objid ("eb43816d-77d7-45d7-85d8-aa827e7920d6")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        DimensionedUnit other = (DimensionedUnit) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'dimension' role.<p>
     * Role description:
     * null
     */
    @objid ("ef52b9c3-4ab1-4f26-92fe-20d5ac03d2c7")
    public UnitDimension getDimension() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(DimensionedUnit.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(DimensionedUnit.MdaTypes.MDAASSOCDEP_ROLE), "dimension")){
                  if (UnitDimension.canInstantiate(d.getDependsOn()))
                     return (UnitDimension)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), UnitDimension.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the underlying {@link DataType}.
     * 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("de199e19-cf49-4efb-a0a9-51d7d15eabf1")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    @objid ("7280bd88-5257-4ff5-ad46-cb4b9f66c8bf")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'dimension' role.<p>
     * Role description:
     * null
     */
    @objid ("9600c1c2-826b-4aeb-bdfe-562c0ea88ad2")
    public void setDimension(final UnitDimension obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(DimensionedUnit.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(DimensionedUnit.MdaTypes.MDAASSOCDEP_ROLE), "dimension")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), DimensionedUnit.MdaTypes.MDAASSOCDEP);
              dep.setName("dimension");      dep.putTagValue(DimensionedUnit.MdaTypes.MDAASSOCDEP_ROLE, "dimension");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("8c46a634-4dbe-4247-89da-4418405e9c48")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("000d4b1b-1252-498a-bb20-681eed4e4864")
    protected DimensionedUnit(final DataType elt) {
        super(elt);
    }

    @objid ("7020bdc9-61ca-45e7-b8b0-e04dd997a97d")
    public static final class MdaTypes {
        @objid ("0deae437-b81f-4ddd-bff9-91cd908f4176")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("999948a3-e19f-4489-a7e9-4579ae05ac34")
        private static Stereotype MDAASSOCDEP;

        @objid ("bc42fe73-03db-4f7d-96c5-4860715e7392")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6e2d34a2-73ff-4863-826b-feb3210dad0b")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "7e307b11-f18c-4c69-8c76-7b57b8d1bb8e");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


static {
        if(CamelDesignerModule.getInstance() != null) {
            init(CamelDesignerModule.getInstance().getModuleContext());
        }
    }
    }

}
