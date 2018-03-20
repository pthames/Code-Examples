Public Class ShadyOne

    'Phillip Thames , Shady Pines Retirement Project

    Dim Rent As Integer

    Function PullData(ByVal Tenants As Integer, ByVal MealOne As Integer, ByVal MealTwo As Integer) As Integer
        Dim Peeps As Integer = Tenants
        Dim FoodOne As Integer = MealOne
        Dim FoodTwo As Integer = MealTwo

        If Peeps = 1 Then
            txtOne.Text = (Rent + FoodOne).ToString("c")
        End If
        If Peeps = 2 Then
            txtOne.Text = (Rent / 2 + FoodOne).ToString("c")
            txtTwo.Text = (Rent / 2 + FoodTwo).ToString("c")
        End If

        Return 0
    End Function



    Private Sub PictureBox1_Click(sender As Object, e As EventArgs) Handles PictureBox1.Click

    End Sub

    Private Sub GroupBox1_Enter(sender As Object, e As EventArgs) Handles GroupBox1.Enter

    End Sub

    Private Sub Button1_Click(sender As Object, e As EventArgs) Handles btnStart.Click


        If RadEmp.Checked Then
            Rent = 1500
        End If
        If RadItal.Checked Then
            Rent = 1650
        End If
        If RadChar.Checked Then
            Rent = 1900
        End If
        If RadReg.Checked Then
            Rent = 2000
        End If





        Dim frmShadyTwo As New ShadyTwo
        frmShadyTwo.Visible = True



    End Sub

    Private Sub RadioButton2_CheckedChanged(sender As Object, e As EventArgs) Handles RadItal.CheckedChanged

    End Sub

    Private Sub Button2_Click(sender As Object, e As EventArgs) Handles Button2.Click
        Me.Close()
    End Sub

    Private Sub Button1_Click_1(sender As Object, e As EventArgs)

    End Sub

    Private Sub Button3_Click(sender As Object, e As EventArgs) Handles Button3.Click
        txtOne.Clear()
        txtTwo.Clear()

    End Sub
End Class
