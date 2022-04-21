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
import fr.softeam.cameldesigner.api.camelcore.standard.datatype.FeatureDataType;
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
 * Proxy class to handle a {@link DataType} with << Unit >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("ad5e8f7b-b3a0-4678-bcf5-5ad638242927")
public abstract class Unit extends FeatureDataType {
    @objid ("f34fc6d5-c337-4c22-ab20-f1148733d240")
    public static final String STEREOTYPE_NAME = "Unit";

    /**
     * Tells whether a {@link Unit proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << Unit >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("38492abd-a3ca-47af-99b2-3b9b255fa282")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Unit.STEREOTYPE_NAME));
    }

    @objid ("b4187319-dc53-4313-a5b9-108169109c29")
    public static Unit instantiate(final DataType obj) {
        return DimensionedUnit.canInstantiate(obj) ?  DimensionedUnit.instantiate(obj) : Dimensionless.canInstantiate(obj) ? new Dimensionless(obj) : null;
    }

    /**
     * Add a value of the 'multipleOf' role.<p>
     * Role description:
     * null
     */
    @objid ("1bceff8e-67b0-4fd0-b219-22e55e4b04c7")
    public void addMultipleOf(final Unit obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(obj.getElement(), this.elt, Unit.MdaTypes.MDAASSOCDEP);
            d.setName("");
            d.putTagValue(Unit.MdaTypes.MDAASSOCDEP_ROLE, "");
        }
    }

    @objid ("800d67e5-90f0-4f27-a744-9f730f1f0c67")
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
        Unit other = (Unit) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link DataType}.
     * 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("aa21ea6d-5384-4259-a99e-9a2ea145de48")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    /**
     * Get the values of the 'multipleOf' role.<p>
     * Role description:
     * null
     */
    @objid ("289c336b-739a-4318-9574-ee750d3d8d50")
    public List<Unit> getMultipleOf() {
        List<Unit> results = new ArrayList<>();
        for (Dependency d : this.elt.getImpactedDependency()) {
          if (d.isStereotyped(Unit.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(Unit.MdaTypes.MDAASSOCDEP_ROLE), "")
              && Unit.canInstantiate(d.getImpacted())) {
                 results.add((Unit)CamelDesignerProxyFactory.instantiate(d.getImpacted(), Unit.STEREOTYPE_NAME));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("9e787335-2e83-482f-8ac3-6c498786bc61")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from 'multipleOf' role.<p>
     * Role description:
     * null
     */
    @objid ("a8c9200f-ce84-4fb3-aec1-efc0c65a0dc9")
    public boolean removeMultipleOf(final Unit obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getImpactedDependency())) {
            if (d.isStereotyped(Unit.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Unit.MdaTypes.MDAASSOCDEP_ROLE), ""))
              if (Objects.equals(d.getImpacted(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    @objid ("acb2e845-73b3-40db-9281-6b0c618e3a8c")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("9fc9da03-82a0-4acc-a351-85c0dfa72fe2")
    protected Unit(final DataType elt) {
        super(elt);
    }

    @objid ("6a12e779-f186-4ba1-ab98-47ecdcdb6ad2")
    public static final class MdaTypes {
        @objid ("2470811f-f4dc-4704-b5b7-bd1d38cb44b4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("078311b7-5b8a-468c-a9d7-80b1ccc8024e")
        private static Stereotype MDAASSOCDEP;

        @objid ("b8e80106-0ed7-4ef9-8977-4e2d243366a2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e8be1a8d-b48b-4471-a49c-776860b477f0")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "56c9f56b-274d-4816-80c8-72536d1d7295");
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
