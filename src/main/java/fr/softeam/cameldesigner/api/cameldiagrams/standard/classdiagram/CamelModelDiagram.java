/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.cameldiagrams.infrastructure.abstractdiagram.AbstractCamelDiagram;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ClassDiagram} with << CamelModelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("2c59f838-a1e2-4ac9-bf6c-e229175cc354")
public class CamelModelDiagram extends AbstractCamelDiagram {
    @objid ("15c4212b-7817-433d-ae7e-83690179c2fb")
    public static final String STEREOTYPE_NAME = "CamelModelDiagram";

    /**
     * Tells whether a {@link CamelModelDiagram proxy} can be instantiated from a {@link MObject} checking it is a {@link ClassDiagram} stereotyped << CamelModelDiagram >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("89f7d926-bef1-406a-b8f5-3c6dd8ad6cfd")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ClassDiagram) && ((ClassDiagram) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelModelDiagram.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ClassDiagram} stereotyped << CamelModelDiagram >> then instantiate a {@link CamelModelDiagram} proxy.
     * 
     * @return a {@link CamelModelDiagram} proxy on the created {@link ClassDiagram}.
     */
    @objid ("5d674d6c-28c6-4209-92f9-4365a95258e3")
    public static CamelModelDiagram create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.ClassDiagram");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CamelModelDiagram.STEREOTYPE_NAME);
        return CamelModelDiagram.instantiate((ClassDiagram)e);
    }

    /**
     * Tries to instantiate a {@link CamelModelDiagram} proxy from a {@link ClassDiagram} stereotyped << CamelModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ClassDiagram
     * @return a {@link CamelModelDiagram} proxy or <i>null</i>.
     */
    @objid ("94cdf23f-e03d-4d85-a7ca-7328e21c72ec")
    public static CamelModelDiagram instantiate(final ClassDiagram obj) {
        return CamelModelDiagram.canInstantiate(obj) ? new CamelModelDiagram(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CamelModelDiagram} proxy from a {@link ClassDiagram} stereotyped << CamelModelDiagram >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ClassDiagram}
     * @return a {@link CamelModelDiagram} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("42f88c13-bf8b-4c8f-914e-9e8fa93785d0")
    public static CamelModelDiagram safeInstantiate(final ClassDiagram obj) throws IllegalArgumentException {
        if (CamelModelDiagram.canInstantiate(obj))
        	return new CamelModelDiagram(obj);
        else
        	throw new IllegalArgumentException("CamelModelDiagram: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("642dcc39-17bd-476b-9dfe-5f642a2f8861")
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
        CamelModelDiagram other = (CamelModelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}. 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("1b97f93c-297c-49ed-a656-e09164540a8e")
    @Override
    public ClassDiagram getElement() {
        return (ClassDiagram)super.getElement();
    }

    @objid ("33a0bb02-f751-4bfb-bc45-50c3ffe18c22")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("5b21fb26-6961-4938-af13-561334ff9a3d")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("fdcadd39-9cf4-4018-8143-2f6b0c851fb6")
    protected CamelModelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("4c4f1d52-c636-4b3b-a84c-7e0d2ad342f4")
    public static final class MdaTypes {
        @objid ("723ef227-540e-4c4f-9c6f-397cd33329a9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d0a81931-a5bd-465a-8279-827631df5c28")
        private static Stereotype MDAASSOCDEP;

        @objid ("bbf90a41-feab-4a4f-ac2f-52bac23c9d20")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("feff9d08-e35a-4527-ac93-f7164379ef77")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "eec7381e-4c61-4f7c-9a1c-210f2fe38377");
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
