/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.constraintmodel.standard.constraint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.CamelConstraint;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.IfThenConstraint;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricConstraint;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricVariableConstraint;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Constraint} with << LogicalConstraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("53b9a5c1-0a76-403f-aa18-f79a25ba62a5")
public class LogicalConstraint extends CompositeConstraint {
<<<<<<< HEAD
    @objid ("6a00c86e-5d87-4111-9767-bad5638530c4")
    public static final String STEREOTYPE_NAME = "LogicalConstraint";

    @objid ("0111f650-30b0-45ac-9eb5-b5ed389cf93e")
=======
    @objid ("335a18f7-6599-46ff-b8ce-dea5164e2e22")
    public static final String STEREOTYPE_NAME = "LogicalConstraint";

    @objid ("59abb854-97b5-466d-ad17-302aa2228a44")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String LOGICALOPERATOR_TAGTYPE = "logicalOperator";

    /**
     * Tells whether a {@link LogicalConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << LogicalConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("f0c5cd38-1647-491e-a265-e27c17bcc6e1")
=======
    @objid ("9d4d187d-7a5d-481f-a667-7005b894a427")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, LogicalConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << LogicalConstraint >> then instantiate a {@link LogicalConstraint} proxy.
     * 
     * @return a {@link LogicalConstraint} proxy on the created {@link Constraint}.
     */
<<<<<<< HEAD
    @objid ("c7754af1-f971-4c14-a54b-d19617fefef3")
=======
    @objid ("205c2a45-c40e-4e53-b904-8364c6aa922c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static LogicalConstraint create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Constraint");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, LogicalConstraint.STEREOTYPE_NAME);
        return LogicalConstraint.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link LogicalConstraint} proxy from a {@link Constraint} stereotyped << LogicalConstraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Constraint
     * @return a {@link LogicalConstraint} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("414115c5-fb7e-4af1-bdc9-c88fe0f2201d")
=======
    @objid ("63b5fd99-f771-4b13-a897-f422eda75474")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static LogicalConstraint instantiate(final Constraint obj) {
        return LogicalConstraint.canInstantiate(obj) ? new LogicalConstraint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link LogicalConstraint} proxy from a {@link Constraint} stereotyped << LogicalConstraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Constraint}
     * @return a {@link LogicalConstraint} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("c256bd55-2e2e-4a36-947d-64c26e2b9695")
=======
    @objid ("aa5728a3-21b9-4cc6-94c4-9dd326bafd45")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static LogicalConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (LogicalConstraint.canInstantiate(obj))
        	return new LogicalConstraint(obj);
        else
        	throw new IllegalArgumentException("LogicalConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'constraints' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("99325ddb-a26d-42c3-9649-1da1c4554dd8")
=======
    @objid ("d6f3c36a-4bc7-42b7-b6b9-a917528682d3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addConstraints(final CamelConstraint obj) {
        if (obj!=null)
          ((Constraint) this.elt).getConstraintDefinition().add(obj.getElement());
    }

<<<<<<< HEAD
    @objid ("db625366-1dd5-4ffe-8b98-668a38693c39")
=======
    @objid ("831d46a6-0051-4bdf-a0eb-c944589d189b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
        LogicalConstraint other = (LogicalConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'constraints' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("ae95b8d3-cd8f-4bad-9c73-b389548e5e62")
=======
    @objid ("b51cc3eb-7a90-460f-896f-1bbac2c70430")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<CamelConstraint> getConstraints() {
        List<CamelConstraint> results = new ArrayList<>();
        for (Constraint mObj : ((Constraint) this.elt).getConstraintDefinition()){
        	if (MetricConstraint.canInstantiate(mObj))
        			results.add((MetricConstraint)CamelDesignerProxyFactory.instantiate(mObj, MetricConstraint.STEREOTYPE_NAME));
        	if (MetricVariableConstraint.canInstantiate(mObj))
        			results.add((MetricVariableConstraint)CamelDesignerProxyFactory.instantiate(mObj, MetricVariableConstraint.STEREOTYPE_NAME));
        	if (IfThenConstraint.canInstantiate(mObj))
        			results.add((IfThenConstraint)CamelDesignerProxyFactory.instantiate(mObj, IfThenConstraint.STEREOTYPE_NAME));
        	if (LogicalConstraint.canInstantiate(mObj))
        			results.add((LogicalConstraint)CamelDesignerProxyFactory.instantiate(mObj, LogicalConstraint.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("d76d2c11-e4b2-40b5-9eee-98a290de297c")
=======
    @objid ("7e32884e-5e75-42f6-b2fc-c6d92ea6a27b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    /**
     * Getter for string property 'logicalOperator'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("3b843f6f-da14-4429-b949-d0dd7afe8163")
=======
    @objid ("651ca0ef-02e4-4a2b-9d78-b0f5eb731f57")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getLogicalOperator() {
        return this.elt.getTagValue(LogicalConstraint.MdaTypes.LOGICALOPERATOR_TAGTYPE_ELT);
    }

<<<<<<< HEAD
    @objid ("1ab9dfe1-e313-4df1-b87f-dcc3ba014ce5")
=======
    @objid ("62176a35-6bc5-4202-9a6d-fb39ff1ee8d4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'constraints' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("5aff3c3b-4914-405a-a299-1fe788420ca1")
=======
    @objid ("42281376-45c0-4302-b910-a8bbeae3356a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeConstraints(final CamelConstraint obj) {
        return (obj!=null)? ((Constraint) this.elt).getConstraintDefinition().remove(obj.getElement()) : false;
    }

    /**
     * Setter for string property 'logicalOperator'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("8e5ce0a7-6802-4607-9b9b-fa10f22710de")
=======
    @objid ("fc6e0c71-ad54-4d06-bcf7-a1c75a840ef7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setLogicalOperator(final String value) {
        this.elt.putTagValue(LogicalConstraint.MdaTypes.LOGICALOPERATOR_TAGTYPE_ELT, value);
    }

    @objid ("cecf2787-76fc-4efb-8c6a-9365a22290d6")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

<<<<<<< HEAD
    @objid ("2c1916f1-b911-4e8c-b290-a9bb0f584f1d")
=======
    @objid ("cc004a79-a4ad-45bc-b7b6-bc637ec422a9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected LogicalConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("f5630e18-22a2-424e-9cbf-865d8acd7362")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("22116939-7092-4ef1-a157-078ee5b90c6a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6bafac63-799b-4467-bdaa-271ffac47964")
        public static TagType LOGICALOPERATOR_TAGTYPE_ELT;

        @objid ("266d3918-44bd-441a-8ba1-1c4c74f13afc")
        private static Stereotype MDAASSOCDEP;

        @objid ("2dd78968-b717-49db-8bab-0e4244dd0428")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ed29e468-b7fa-4af0-bf40-36733913132b")
=======
        @objid ("a9c9dd52-8fb8-48df-abc4-46905e31f866")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b8c27fb1-9f4d-4ca5-b78f-49c6337dcf4e")
        public static TagType LOGICALOPERATOR_TAGTYPE_ELT;

        @objid ("45927f1b-eb30-4372-9480-e119cc5fde24")
        private static Stereotype MDAASSOCDEP;

        @objid ("62cad917-4e70-4778-a6b2-af5d01ee3823")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9ab6eb04-a5d6-454e-8ee4-a9d565fa7037")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "a266bdba-acc2-4ce2-81a0-4b2f404f7db7");
            LOGICALOPERATOR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "eb2e6178-406b-46d5-80d2-5453be9fce45");
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
