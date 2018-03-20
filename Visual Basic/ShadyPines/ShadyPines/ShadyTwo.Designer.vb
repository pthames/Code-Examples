<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class ShadyTwo
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Me.GroupBox1 = New System.Windows.Forms.GroupBox()
        Me.RadTwo = New System.Windows.Forms.RadioButton()
        Me.RadOne = New System.Windows.Forms.RadioButton()
        Me.GroupBox2 = New System.Windows.Forms.GroupBox()
        Me.Rad21One = New System.Windows.Forms.RadioButton()
        Me.Rad14One = New System.Windows.Forms.RadioButton()
        Me.Rad7One = New System.Windows.Forms.RadioButton()
        Me.GroupBox3 = New System.Windows.Forms.GroupBox()
        Me.Rad21Two = New System.Windows.Forms.RadioButton()
        Me.Rad14Two = New System.Windows.Forms.RadioButton()
        Me.Rad7Two = New System.Windows.Forms.RadioButton()
        Me.btnReturn = New System.Windows.Forms.Button()
        Me.GroupBox1.SuspendLayout()
        Me.GroupBox2.SuspendLayout()
        Me.GroupBox3.SuspendLayout()
        Me.SuspendLayout()
        '
        'GroupBox1
        '
        Me.GroupBox1.Controls.Add(Me.RadTwo)
        Me.GroupBox1.Controls.Add(Me.RadOne)
        Me.GroupBox1.Font = New System.Drawing.Font("Impact", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.GroupBox1.Location = New System.Drawing.Point(54, 23)
        Me.GroupBox1.Name = "GroupBox1"
        Me.GroupBox1.Size = New System.Drawing.Size(425, 78)
        Me.GroupBox1.TabIndex = 0
        Me.GroupBox1.TabStop = False
        Me.GroupBox1.Text = "Number of Occupants"
        '
        'RadTwo
        '
        Me.RadTwo.AutoSize = True
        Me.RadTwo.Location = New System.Drawing.Point(241, 39)
        Me.RadTwo.Name = "RadTwo"
        Me.RadTwo.Size = New System.Drawing.Size(89, 21)
        Me.RadTwo.TabIndex = 1
        Me.RadTwo.TabStop = True
        Me.RadTwo.Text = "Two People"
        Me.RadTwo.UseVisualStyleBackColor = True
        '
        'RadOne
        '
        Me.RadOne.AutoSize = True
        Me.RadOne.Location = New System.Drawing.Point(16, 39)
        Me.RadOne.Name = "RadOne"
        Me.RadOne.Size = New System.Drawing.Size(88, 21)
        Me.RadOne.TabIndex = 0
        Me.RadOne.TabStop = True
        Me.RadOne.Text = "One Person"
        Me.RadOne.UseVisualStyleBackColor = True
        '
        'GroupBox2
        '
        Me.GroupBox2.Controls.Add(Me.Rad21One)
        Me.GroupBox2.Controls.Add(Me.Rad14One)
        Me.GroupBox2.Controls.Add(Me.Rad7One)
        Me.GroupBox2.Font = New System.Drawing.Font("Impact", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.GroupBox2.Location = New System.Drawing.Point(54, 131)
        Me.GroupBox2.Name = "GroupBox2"
        Me.GroupBox2.Size = New System.Drawing.Size(200, 194)
        Me.GroupBox2.TabIndex = 1
        Me.GroupBox2.TabStop = False
        Me.GroupBox2.Text = "Meal Plan for First Tenant"
        '
        'Rad21One
        '
        Me.Rad21One.AutoSize = True
        Me.Rad21One.Location = New System.Drawing.Point(16, 142)
        Me.Rad21One.Name = "Rad21One"
        Me.Rad21One.Size = New System.Drawing.Size(127, 38)
        Me.Rad21One.TabIndex = 2
        Me.Rad21One.TabStop = True
        Me.Rad21One.Text = "21 Meals per Week" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "$ 980 per Month"
        Me.Rad21One.UseVisualStyleBackColor = True
        '
        'Rad14One
        '
        Me.Rad14One.AutoSize = True
        Me.Rad14One.Location = New System.Drawing.Point(16, 88)
        Me.Rad14One.Name = "Rad14One"
        Me.Rad14One.Size = New System.Drawing.Size(127, 38)
        Me.Rad14One.TabIndex = 1
        Me.Rad14One.TabStop = True
        Me.Rad14One.Text = "14 Meals per Week" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "$ 710 per Month"
        Me.Rad14One.UseVisualStyleBackColor = True
        '
        'Rad7One
        '
        Me.Rad7One.AutoSize = True
        Me.Rad7One.Location = New System.Drawing.Point(16, 32)
        Me.Rad7One.Name = "Rad7One"
        Me.Rad7One.Size = New System.Drawing.Size(120, 38)
        Me.Rad7One.TabIndex = 0
        Me.Rad7One.TabStop = True
        Me.Rad7One.Text = "7 Meals per Week" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "$ 400 per Month"
        Me.Rad7One.UseVisualStyleBackColor = True
        '
        'GroupBox3
        '
        Me.GroupBox3.Controls.Add(Me.Rad21Two)
        Me.GroupBox3.Controls.Add(Me.Rad14Two)
        Me.GroupBox3.Controls.Add(Me.Rad7Two)
        Me.GroupBox3.Font = New System.Drawing.Font("Impact", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.GroupBox3.Location = New System.Drawing.Point(279, 131)
        Me.GroupBox3.Name = "GroupBox3"
        Me.GroupBox3.Size = New System.Drawing.Size(200, 194)
        Me.GroupBox3.TabIndex = 2
        Me.GroupBox3.TabStop = False
        Me.GroupBox3.Text = "Meal Plan for Second Tenant"
        Me.GroupBox3.Visible = False
        '
        'Rad21Two
        '
        Me.Rad21Two.AutoSize = True
        Me.Rad21Two.Location = New System.Drawing.Point(16, 142)
        Me.Rad21Two.Name = "Rad21Two"
        Me.Rad21Two.Size = New System.Drawing.Size(127, 38)
        Me.Rad21Two.TabIndex = 2
        Me.Rad21Two.TabStop = True
        Me.Rad21Two.Text = "21 Meals per Week" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "$ 980 per Month"
        Me.Rad21Two.UseVisualStyleBackColor = True
        '
        'Rad14Two
        '
        Me.Rad14Two.AutoSize = True
        Me.Rad14Two.Location = New System.Drawing.Point(16, 88)
        Me.Rad14Two.Name = "Rad14Two"
        Me.Rad14Two.Size = New System.Drawing.Size(127, 38)
        Me.Rad14Two.TabIndex = 1
        Me.Rad14Two.TabStop = True
        Me.Rad14Two.Text = "14 Meals per Week" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "$ 710 per Month"
        Me.Rad14Two.UseVisualStyleBackColor = True
        '
        'Rad7Two
        '
        Me.Rad7Two.AutoSize = True
        Me.Rad7Two.Location = New System.Drawing.Point(16, 32)
        Me.Rad7Two.Name = "Rad7Two"
        Me.Rad7Two.Size = New System.Drawing.Size(120, 38)
        Me.Rad7Two.TabIndex = 0
        Me.Rad7Two.TabStop = True
        Me.Rad7Two.Text = "7 Meals per Week" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "$ 400 per Month"
        Me.Rad7Two.UseVisualStyleBackColor = True
        '
        'btnReturn
        '
        Me.btnReturn.Font = New System.Drawing.Font("Impact", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.btnReturn.Location = New System.Drawing.Point(149, 343)
        Me.btnReturn.Name = "btnReturn"
        Me.btnReturn.Size = New System.Drawing.Size(225, 54)
        Me.btnReturn.TabIndex = 3
        Me.btnReturn.Text = "After Choosing Your Optioins" & Global.Microsoft.VisualBasic.ChrW(13) & Global.Microsoft.VisualBasic.ChrW(10) & "Click Here to View Your Total Rent"
        Me.btnReturn.UseVisualStyleBackColor = True
        '
        'ShadyTwo
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 13.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(520, 409)
        Me.Controls.Add(Me.btnReturn)
        Me.Controls.Add(Me.GroupBox3)
        Me.Controls.Add(Me.GroupBox2)
        Me.Controls.Add(Me.GroupBox1)
        Me.Name = "ShadyTwo"
        Me.Text = "Slim Shady Pines"
        Me.GroupBox1.ResumeLayout(False)
        Me.GroupBox1.PerformLayout()
        Me.GroupBox2.ResumeLayout(False)
        Me.GroupBox2.PerformLayout()
        Me.GroupBox3.ResumeLayout(False)
        Me.GroupBox3.PerformLayout()
        Me.ResumeLayout(False)

    End Sub
    Friend WithEvents GroupBox1 As System.Windows.Forms.GroupBox
    Friend WithEvents RadTwo As System.Windows.Forms.RadioButton
    Friend WithEvents RadOne As System.Windows.Forms.RadioButton
    Friend WithEvents GroupBox2 As System.Windows.Forms.GroupBox
    Friend WithEvents Rad21One As System.Windows.Forms.RadioButton
    Friend WithEvents Rad14One As System.Windows.Forms.RadioButton
    Friend WithEvents Rad7One As System.Windows.Forms.RadioButton
    Friend WithEvents GroupBox3 As System.Windows.Forms.GroupBox
    Friend WithEvents Rad21Two As System.Windows.Forms.RadioButton
    Friend WithEvents Rad14Two As System.Windows.Forms.RadioButton
    Friend WithEvents Rad7Two As System.Windows.Forms.RadioButton
    Friend WithEvents btnReturn As System.Windows.Forms.Button
End Class
